package fileSearhProject;

import java.awt.Desktop;
import java.io.*;
import java.util.StringTokenizer;

public class MyFile {

	static String filename;

	MyFile() {
	}

	// parseAllFiles();
	public static void parseAllFiles(String parentDirectory) {

		String rootDir = System.getenv("SystemDrive");
		// System.out.println("search");

		File[] filesInDirectory = new File(parentDirectory).listFiles();
		if (filesInDirectory != null) {// check filesIndirectory is not null...
			for (File f : filesInDirectory) {
				if (f.isDirectory()) {
					parseAllFiles(f.getAbsolutePath());
				}
				// System.out.println("Current File -> " + f);
				StringTokenizer str = new StringTokenizer(f.getAbsolutePath(),
						"\\");

				while (str.hasMoreTokens()) {
					String temp = str.nextToken();
					temp = temp.toLowerCase();
					if (temp.equalsIgnoreCase(filename)
							|| temp.contains(filename)) {
						System.out.println("found and path is "
								+ f.getAbsolutePath());
						String file = f.getAbsolutePath();
						String openfile = file.replace("\\", "/");

						try {
							if (openfile != "") {
								Desktop openfile1 = Desktop.getDesktop();
                                                                                                                                                   
								// Open a file
								openfile1.open(new File(openfile));
								Thread.sleep(500);
							} else {
								System.out.println("file not found ");
							}

						} catch (Exception e) {
							System.out.println(e);
						}

					}
				}
			}

		}
	}

	public static void main(String file1) {
		filename = file1;
		File[] files = File.listRoots();

		for (File f : files) {
			parseAllFiles(f.getPath());
			System.out.println(f.getPath());
		}
		System.out.println("end");
	}
}