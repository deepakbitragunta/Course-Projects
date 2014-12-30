package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CheckSortingProblem {
	// Data structures to hold the results
	static HashMap<Integer, Integer> passStats = new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> failStats = new HashMap<Integer, Integer>();
	static HashMap<Integer, String> successMap = new HashMap<Integer, String>();
	static HashMap<Integer, String> failedMap = new HashMap<Integer, String>();
	
	// Get all the file names in the given directory
	public static File[] listFiles(String dir_path) {
		File input_dir = new File(dir_path);
		File[] files_in_dir = null;

		if (input_dir != null && input_dir.isDirectory()) {
			files_in_dir = input_dir.listFiles();
		}
		return files_in_dir;
	}
	
	/*
	 * It executes all the pre-defined test cases on the set of the java files
	 */
	public static void runTestCases(int[][] input, int[][] output, Method method, Object classObj, PrintWriter writer) {
		boolean match = false;
	
		String currentfileName =  method.getDeclaringClass().getName();
		String success = "", failure = "";
		
		int m, j = 0;
		
		int testOutput[] = null;

		for (m = 0; m < input.length; ++m) {
			try {
				// temporary array to hold the input as the method invocation is 
				// pass by reference and the input array can be changed
				int temp[] = new int[input[m].length];

				for (int k = 0; k < temp.length; ++k) {
					temp[k] = input[m][k];
				}

				j = 0; // reset j = 0 as there is a chance of exception
				
				// to invoke private methods in the class
				method.setAccessible(true);
				
				if (method.getParameterTypes().length == 1) {
					testOutput = (int[]) method.invoke(classObj, (Object) temp);
				} else if (method.getParameterTypes().length == 1) {
					testOutput = (int[]) method.invoke(classObj, (Object) temp,
							temp.length);
				} else {
					testOutput = (int[]) method.invoke(classObj, (Object) temp,
							0, temp.length);
				}

				// input and output comparison
				if (testOutput.length == 0) {
					testOutput = temp;
				}
				if (testOutput.length != output[m].length) {
					match = false;
				}

				for (j = 0; j < testOutput.length; ++j) {
					// System.out.println(output[j]);
					if (output[m][j] != testOutput[j]) {
						match = false;
						break;
					}
				}
				if (j == testOutput.length) {
					match = true;
				}

			}

			catch (InvocationTargetException e) {
				// Not throwing the exception as we have to execute other test cases for other files
				continue;
			} catch (Exception e) {
				// Not throwing the exception as we have to execute other test cases for other files
				continue;
			} finally {
				// This block always executes and counts the success and failures of test cases
				if (match == true && testOutput != null
						&& j == testOutput.length) {
					success += m + ",";
					if (passStats.containsKey(m)) {
						int count = passStats.get(m);
						passStats.put(m, count + 1);
						String files = successMap.get(m);
						successMap.put(m, files + ", " + currentfileName);
					} else {
						passStats.put(m, 1);
						successMap.put(m, currentfileName);
					}
				} else {
					failure += m + ",";
					if (failStats.containsKey(m)) {
						int count = failStats.get(m);
						failStats.put(m, count + 1);
						String files = failedMap.get(m);
						failedMap.put(m, files + ", " + currentfileName);
					} else {
						failStats.put(m, 1);
						failedMap.put(m, currentfileName);
					}
				}

			}
		}
		// Record all the results by writing to the file 
		if (success.length() != 0 || failure.length() != 0) {
			writer.println("FileName: " + currentfileName + ".java");
			writer.println("Success test cases");
			writer.println(success);
			writer.println("Failure test cases");
			writer.println(failure);
			writer.println("");
		}
	}

	/*
	 * This method defines the testCases and creates class objects for the input files and 
	 * invokes the runTestcases method for each file
	 */
	public static void executePrograms(File[] files, String output_path) {
		Object object = null;
		String className = "";
		PrintWriter writer = null;
		Method[] all_methods = null;
		int i = 0;

		int input[][] = {
				{ 1, 6, 2, 10, 8 },
				{ 1, 2, 4, 5, 6 },
				{ 6, 2, 12, 4, 8, 1, -1, 0, 2 },
				{ 1 },
				{ 20, 1, 2, 5, 6 },
				{ 2, 4, 5, 8, 12, -10, -2, -2, -4 },
				{ -2, -2, -2 },
				{ -1, -3, 1, 3, 4, 5 },
				{ -3, -2, 0 },
				{ 0, 0, 0 },
				{ 81, 49, -98, 150, -51, 458, 407, 538, 993111, 317, -91 },
				{ -941494, 252357, -933132, 852267, -128874, -61749, 224656,
						931348, -286007, -420853, -605324, 135931 },
				{ 289325, -744424, -71724, -754290, 64902, -501687, 697467,
						533061, -952264, 926375, 763682, -573623, 593380,
						-832802, -822194, -431574, 602034, 746115, -672317,
						810982, 598594, -542271, -874380, 157213, 833177 },
				{ -646, 351, -673, -725, 88, -701, 438, 789, -745, -753, -375,
						-811, 405, -870, -707, 158, -421, -545, 180, 479, 260,
						-781, -472, 324, 452 },
				{ -522, 866, -263, 765, 732, 837, -657, 107, 337 },
				{ -12, 6, 15, 18, 24, 53, 67, 89, 91, 95 },
				{ -40, -34, -8, -7, 0, 4, 5, 7, 45, 80 },
				{ 59, 17, -18, -39, -40, -45 },
				{ 98, 95, 93, 84, 83, 82, 81, 74, 68, 55, 44, 39, 36, 29, 21,
						4, -1, -20, -42, -44, -45, -50, -63, -68, -74 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ -7942, -6547, -1661, 35, 667, 1430, 2190, 3722, 5194, 5332,
						6302, 7397, 7732, 8082, 9540 },
				{ 667, 1430, 3722, 3722, 7397, 8082, -7942, -6547, -1661, 35,
						3722, 3722, 8082, 9540, 1430 },
				{ -40, 70, -8, -7, 70, 4, 5, 70, 45, 80 },
				{ -517338, -987543, -309516, -440972, -51178, -497912 },
				{ -1 }, 
				{ 0 }, 
				{},
				{34002,1222, 333, 2000, 100, 1022,39993,112,-2002, -1, 0, 1002},
				};

		int output[][] = {
				{ 1, 2, 6, 8, 10 },
				{ 1, 2, 4, 5, 6 },
				{ -1, 0, 1, 2, 2, 4, 6, 8, 12 },
				{ 1 },
				{ 1, 2, 5, 6, 20 },
				{ -10, -4, -2, -2, 2, 4, 5, 8, 12 },
				{ -2, -2, -2 },
				{ -3, -1, 1, 3, 4, 5 },
				{ -3, -2, 0 },
				{ 0, 0, 0 },
				{ -98, -91, -51, 49, 81, 150, 317, 407, 458, 538, 993111 },
				{ -941494, -933132, -605324, -420853, -286007, -128874, -61749,
						135931, 224656, 252357, 852267, 931348 },
				{ -952264, -874380, -832802, -822194, -754290, -744424,
						-672317, -573623, -542271, -501687, -431574, -71724,
						64902, 157213, 289325, 533061, 593380, 598594, 602034,
						697467, 746115, 763682, 810982, 833177, 926375 },
				{ -870, -811, -781, -753, -745, -725, -707, -701, -673, -646,
						-545, -472, -421, -375, 88, 158, 180, 260, 324, 351,
						405, 438, 452, 479, 789 },
				{ -657, -522, -263, 107, 337, 732, 765, 837, 866 },
				{ -12, 6, 15, 18, 24, 53, 67, 89, 91, 95 },
				{ -40, -34, -8, -7, 0, 4, 5, 7, 45, 80 },
				{ -45, -40, -39, -18, 17, 59 },
				{ -74, -68, -63, -50, -45, -44, -42, -20, -1, 4, 21, 29, 36,
						39, 44, 55, 68, 74, 81, 82, 83, 84, 93, 95, 98 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ -7942, -6547, -1661, 35, 667, 1430, 2190, 3722, 5194, 5332,
						6302, 7397, 7732, 8082, 9540 },
				{ -7942, -6547, -1661, 35, 667, 1430, 1430, 3722, 3722, 3722,
						3722, 7397, 8082, 8082, 9540 },
				{ -40, -8, -7, 4, 5, 45, 70, 70, 70, 80 },
				{ -987543, -517338, -497912, -440972, -309516, -51178 },
				{ -1 }, 
				{ 0 },
				{},
				{-2002, -1, 0, 100, 112, 333, 1002, 1222, 2000, 34002, 39993},
				};

		// boolean match = false;
		if (files.length == 0) {
			return;
		}

		try {

			writer = new PrintWriter(new FileWriter(output_path, true));

			// For all the input files
			for (int k = 0; k < files.length; ++k) {
				String fileName = files[k].getName();
				className = fileName.replaceAll(".java", "");
				System.out.println(fileName);
				try {
					Class classDefn = Class.forName(className);
					Object classObj = classDefn.newInstance();

					all_methods = classDefn.getDeclaredMethods();

					// System.out.println("Methods in the class: " + className);
					// Get all the methods
					for (i = 0; i < all_methods.length; ++i) {
						// System.out.println("Method " + i + ": " +
						// all_methods[i].getName());
						// match = true;

						// Get the argument types
						Class<?>[] all_types = all_methods[i]
								.getParameterTypes();
						// System.out.println("Argument types of the method:" );
						Class<?> return_type = all_methods[i].getReturnType();

						if (all_types.length == 1
								&& all_types[0].isArray()
								&& (all_methods[i].getName().contains("sort") || return_type
										.getName().contains("[I"))) {
							String type_name = all_types[0].getComponentType()
									.getSimpleName() + "[]";
							// System.out.println(type_name);
							if (type_name.contains("int")) {
								runTestCases(input, output, all_methods[i],
										classObj, writer);

							}
						} else if (all_types.length == 2
								&& all_types[0].isArray()
								&& (!all_types[1].isArray())
								&& (all_methods[i].getName().contains("sort") || return_type
										.getName().contains("[I"))) {
							String type_name0 = all_types[0].getComponentType()
									.getSimpleName() + "[]";
							String type_name1 = all_types[1].getName();
							System.out.println(type_name0 + " : " + type_name1);

							if (type_name0.contains("int[]")
									&& type_name1.contains("int")) {
								runTestCases(input, output, all_methods[i],
										classObj, writer);
							}
						} else if (all_types.length == 3
								&& all_types[0].isArray()
								&& (!all_types[1].isArray())
								&& (!all_types[2].isArray())
								&& (all_methods[i].getName().contains("sort") || return_type
										.getName().contains("[I"))) {
							String type_name0 = all_types[0].getComponentType()
									.getSimpleName() + "[]";
							String type_name1 = all_types[1].getName();
							String type_name2 = all_types[2].getName();
							// System.out.println(type_name0 + " : " +
							// type_name1);

							if (type_name0.contains("int[]")
									&& type_name1.contains("int")
									&& type_name2.contains("int")) {
								runTestCases(input, output, all_methods[i],
										classObj, writer);
							}
						}
					}
				} catch (Exception e) {
					writer.println("FileName: " + files[k].getName());
					writer.println("Failure test cases");
					writer.println("All failed");
					writer.println("");
					continue;// for(int j = 0; j < all_types.length; ++j) {
				}

			}
		}
		/*
		 * catch (InstantiationException e) { System.out.println(e); } catch
		 * (IllegalAccessException e) { System.out.println(e); } catch
		 * (ClassNotFoundException e) { System.out.println(e); }
		 */catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (writer != null) {

				writer.print("\n   Stats of Successful test cases executed: \n");
				sortHashMapByValues(passStats, writer);

				
				writer.print("\n   Stats of Failure test cases executed: \n");
				sortHashMapByValues(failStats, writer);
				
				writer.println("Files categorized by testcase \n");
				
				  for (Integer key: successMap.keySet())
					  writer.println("Test Case " + key + " passed in the following files \n\n " + successMap.get(key)  + "\n"); 
					 
				  writer.println("");
				  
				  for (Integer key: failedMap.keySet())
				      writer.println("Test Case " + key + " failed in the following files \n\n "  +  failedMap.get(key) + "\n"); 				 
			
				writer.close();
			}

		}
	}
	// Sorting the results by value in the Hashmap
	public static void sortHashMapByValues(HashMap<Integer, Integer> passedMap,
			PrintWriter writer) {
		List<Integer> mapKeys = new ArrayList<Integer>(passedMap.keySet());
		List<Integer> mapValues = new ArrayList<Integer>(passedMap.values());
		Collections.sort(mapValues);
		Collections.sort(mapKeys);

		Iterator<Integer> valueIt = mapValues.iterator();
		while (valueIt.hasNext()) {
			Object val = valueIt.next();
			Iterator<Integer> keyIt = mapKeys.iterator();

			while (keyIt.hasNext()) {
				Object key = keyIt.next();
				String comp1 = passedMap.get(key).toString();
				String comp2 = val.toString();

				if (comp1.equals(comp2)) {
					writer.println("Test Case " + key + " : "
							+ passedMap.get(key));
					passedMap.remove(key);
					mapKeys.remove(key);
					break;
				}

			}

		}
	}

	public static void main(String[] args) {
		
		// Executes test cases against questions
		// Change the path to questions directory
		File[] qfiles = listFiles("C:\\Tools\\641\\Stackoverflow\\Questions");
		// this method needs path to an already existing text file 
		executePrograms(qfiles,"C:\\Tools\\641\\Stackoverflow\\questions_results.txt");
		
		// Executes test cases against answers
		// Change the path to answers directory
		File[] afiles = listFiles("C:\\Tools\\641\\Stackoverflow\\Answers");
		
		// this method needs path to an already existing text file 
		executePrograms(afiles,"C:\\Tools\\641\\Stackoverflow\\answers_results.txt");
		
		// Executes test cases against answers
		// Change the path to directory which consists of questions and answers
		File[] files = listFiles("C:\\Users\\DeepakBitragunta\\CSProj641\\SortingProblem\\src");
		// this method needs path to an already existing text file 
		executePrograms(files, "C:\\Users\\DeepakBitragunta\\CSProj641\\SortingProblem\\results.txt");
		
	}

}
