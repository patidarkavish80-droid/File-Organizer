import java.io.File;

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

                        int dotIndex = fileName.lastIndexOf(".");

                        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                            String extension = fileName.substring(dotIndex + 1);
                            System.out.println(fileName + " -> " + extension);
                        } else {
                            System.out.println(fileName + " -> No extension");
                        }
                    }
                }

                File imageFolder = new File(folder, "Images");

                if(!imageFolder.exists()){
                    boolean create = imageFolder.mkdir();
                    System.out.println("Folder created : "+create);
                }

                File DocumentFolder  = new File(folder,"Documents");

                if(!DocumentFolder.exists()){
                    boolean create = DocumentFolder.mkdir();
                    System.out.println("Folder created : "+create);
                }

                File MusicFolder = new File(folder,"Music");

                if(!MusicFolder.exists()){
                    boolean create = MusicFolder.mkdir();
                    System.out.println("Folder created : "+create);
                }

                File VideoFolder = new File (folder,"Videos");

                if(!VideoFolder.exists()){
                    boolean create = VideoFolder.mkdir();
                    System.out.println("Folder created : "+create);
                }
            }

        }