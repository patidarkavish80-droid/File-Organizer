# File Organizer

A Java-based file organizer that automatically sorts files into different folders based on their file extensions.

## Features

- Organizes images, documents, music, and videos.
- Moves unknown file types into the `Other` folder.
- Handles files without extensions.
- Supports uppercase and lowercase file extensions.
- Uses Java NIO `Files.move()` to move files.
- Handles file operation errors.
- Prevents duplicate filenames by generating names such as `photo_1.jpg` and `photo_2.jpg`.

## Folder Structure

```text
File-Organizer/
├── src/
│   └── main/
│       └── java/
│           └── FileOrganizer.java
├── text-folder/
├── pom.xml
└── README.md
```

The `text-folder` directory contains the files to organize. The program creates category folders automatically.

## Categories

- **Images:** JPG, PNG, JPEG, GIF, WEBP, and other image formats
- **Documents:** PDF, DOC, DOCX, TXT, XLSX, PPTX, and other document formats
- **Music:** MP3, WAV, AAC, FLAC, and other audio formats
- **Videos:** MP4, MKV, AVI, MOV, and other video formats
- **Other:** Unknown file types and files without extensions

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure the JDK is configured.
4. Place the files you want to organize inside `text-folder`.
5. Run `FileOrganizer.java`.
6. Check the category folders for the organized files.

## Technologies Used

- Java
- File Handling
- Java NIO
- Maven
- Git and GitHub

## Author

Kavish Patidar
