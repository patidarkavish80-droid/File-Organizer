import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.nio.file.*;

public class FileOrganizer {
    public static void main(String[] args) throws IOException {


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
        if (!imageFolder.exists()) {
            boolean create = imageFolder.mkdir();
            System.out.println("Folder created : " + create);
        }


        File DocumentFolder = new File(folder, "Documents");

        if (!DocumentFolder.exists()) {
            boolean create = DocumentFolder.mkdir();
            System.out.println("Folder created : " + create);
        }

        File MusicFolder = new File(folder, "Music");

        if (!MusicFolder.exists()) {
            boolean create = MusicFolder.mkdir();
            System.out.println("Folder created : " + create);
        }

        File VideoFolder = new File(folder, "Videos");

        if (!VideoFolder.exists()) {
            boolean create = VideoFolder.mkdir();
            System.out.println("Folder created : " + create);
        }
        File otherfolder = new File(folder, "Other");
        if (!otherfolder.exists()) {
            boolean create = otherfolder.mkdir();
            System.out.println("Folder created :" + create);
        }


        for (int i = 0; i < files.length; i++) {

            if (files[i].isFile()) {
                String fileName = files[i].getName();

                int dotIndex = fileName.lastIndexOf(".");

                if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                    String extension = fileName.substring(dotIndex + 1);
                    extension = extension.toLowerCase();
                    System.out.println(fileName + " -> " + extension);


                    if (extension.equals("jpg") ||
                            extension.equals("png")||
                            extension.equals("jpeg")||
                            extension.equals("gif")||
                            extension.equals("webp")||
                            extension.equals("bmp")||
                            extension.equals("svg")||
                            extension.equals("ico")||
                            extension.equals("tiff")||
                            extension.equals("tif")||
                            extension.equals("heic")||
                            extension.equals("heif")||
                            extension.equals("avif")) {

                        System.out.println("Images");

                        File source = new File(folder, fileName);
                        File destination = new File(imageFolder, fileName);


                        try {
                            Files.move(source.toPath(), destination.toPath());
                            System.out.println("File moved successfully");
                        } catch (IOException e) {
                            System.out.println("File operation failed :" + fileName + ":" + e.getMessage());
                        }


                    } else if (extension.equals("pdf") ||
                                extension.equals("docx") ||
                                extension.equals("doc") ||
                                extension.equals("txt") ||
                                extension.equals("rtf") ||
                                extension.equals("odt") ||
                                extension.equals("xls") ||
                                extension.equals("xlsx") ||
                                extension.equals("csv") ||
                                extension.equals("odp") ||
                                extension.equals("md") ||
                                extension.equals("ods") ||
                                extension.equals("tex") ||
                                extension.equals("epub") ||
                                extension.equals("pptx") ||
                                extension.equals("ppt")) {

                        System.out.println("Documents");

                        File source = new File(folder, fileName);
                        File destination = new File(DocumentFolder, fileName);

                        try {
                            Files.move(source.toPath(), destination.toPath());
                            System.out.println("File moved successfully");
                        } catch (IOException e) {
                            System.out.println("File operation failed : " + fileName + ":" + e.getMessage());
                        }

                    } else if (extension.equals("mp3") ||
                            extension.equals("wav")||
                            extension.equals("aac")||
                            extension.equals("m4a")||
                            extension.equals("flac")||
                            extension.equals("ogg")||
                            extension.equals("wma")||
                            extension.equals("opus")||
                            extension.equals("aiff")||
                            extension.equals("mid")||
                            extension.equals("midi")) {

                        System.out.println("Music");

                        File source = new File(folder, fileName);
                        File destination = new File(MusicFolder, fileName);

                        try {
                            Files.move(source.toPath(), destination.toPath());
                            System.out.println("File moved successfully");
                        } catch (IOException e) {
                            System.out.println("File operation failed : " + fileName + ":" + e.getMessage());
                        }



                    } else if (extension.equals("mp4") ||
                            extension.equals("mkv")||
                            extension.equals("avi")||
                            extension.equals("mov")||
                            extension.equals("wmv")||
                            extension.equals("flv")||
                            extension.equals("webm")||
                            extension.equals("m4v")||
                            extension.equals("mpeg")||
                            extension.equals("3gp")||
                            extension.equals("ts")) {

                        System.out.println("videos");

                        File source = new File(folder, fileName);
                        File destination = new File(VideoFolder, fileName);

                        try {
                            Files.move(source.toPath(), destination.toPath());
                            System.out.println("File moved successfully");
                        } catch (IOException e) {
                            System.out.println("File operation failed : " + fileName + ":" + e.getMessage());
                        }


                    } else {
                        System.out.println(fileName + " -> Other");

                        File source = new File(folder, fileName);
                        File destination = new File(otherfolder, fileName);

                        try {
                            Files.move(source.toPath(), destination.toPath());
                            System.out.println("file moved successfully");
                        } catch (IOException e) {
                            System.out.println("Folder operation error " + fileName + ":" + e.getMessage());
                        }
                    }
                }else {
                    System.out.println(fileName + " -> No extension");

                    File sourse = new File(folder, fileName);
                    File destination = new File(otherfolder, fileName);

                    try {
                        Files.move(sourse.toPath(), destination.toPath());
                        System.out.println("file moved successfully");
                    } catch (IOException e) {
                        System.out.println("Folder operation error " + fileName + ":" + e.getMessage());
                    }
                }
            }
        }
    }
}
