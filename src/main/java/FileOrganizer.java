import java.awt.*;
import java.io.File;
import java.util.Locale;

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



                for (int i = 0; i < files.length; i++) {

                    if (files[i].isFile()) {
                        String fileName = files[i].getName();

                        int dotIndex = fileName.lastIndexOf(".");

                        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                            String extension = fileName.substring(dotIndex + 1);
                            extension   =  extension.toLowerCase();
                            System.out.println(fileName + " -> " + extension);


                            if(extension.equals("jpg")||extension.equals("png")){
                                System.out.println("Images");

                                File source = new File(folder, fileName);
                                File destination = new File(imageFolder,fileName);
                                boolean res = source.renameTo(destination);
                                System.out.println("Moved: " + res);

                            }
                            if(extension.equals("pdf")||extension.equals("docx")||extension.equals("txt")){
                                System.out.println("Documents");
                                File source = new File(folder,fileName);
                                File destination = new File(DocumentFolder,fileName);
                                boolean res = source.renameTo(destination);
                                System.out.println("Moved: " + res);
                            }
                            if(extension.equals("mp3")||extension.equals("wav")){
                                System.out.println("Music");
                                File source = new File(folder ,fileName);
                                File destination = new File(MusicFolder,fileName);
                                boolean res = source.renameTo(destination);
                                System.out.println("Moved: " + res);
                            }
                            if(extension.equals("mp4")||extension.equals("mkv")){
                                System.out.println("videos");
                                File source = new File(folder ,fileName);
                                File destination = new File(VideoFolder,fileName);
                                boolean res = source.renameTo(destination);
                                System.out.println("Moved: " + res);
                            }
                        } else {
                            System.out.println(fileName + " -> No extension");
                        }

                    }

                }

            }

        }