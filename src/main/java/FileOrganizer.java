import java.io.File;
import java.util.ArrayList;
import static java.lang.Character.getName;

public class FileOrganizer {
            public static void main(String[] args) {


                File folder = new File("text-folder");


                if (!folder.exists()) {
                    boolean created = folder.mkdir();
                    System.out.println("Folder created: " + created);
                }


                if (!folder.isDirectory()) {
                    System.out.println("Folder not found!");
                    return;
                }


                File[] files = folder.listFiles();

                if (files == null) {
                    System.out.println("Unable to read folder.");
                    return;
                }


                for (int i = 0; i < files.length; i++) {

                    if (files[i].isFile()) {
                        String fileName = files[i].getName();

                        // Step 6: Find extension
                        int dotIndex = fileName.lastIndexOf(".");

                        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                            String extension = fileName.substring(dotIndex + 1);
                            System.out.println(fileName + " -> " + extension);
                        } else {
                            System.out.println(fileName + " -> No extension");
                        }
                    }
                }
            }
        }