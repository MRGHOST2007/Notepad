import java.io.File
import java.util.Scanner

class NotesMenuHandler {

    val input = Scanner(System.`in`)
    val noteHandler = NoteHandler()

    fun listFiles(location: String, title: String) {
        var files: Array<File> = File(location).listFiles()
        files.sort()
        if (files.isNotEmpty()) {
            var i = 1
            println("$title : ")
            for (file in files) {
                println("$i - ${file.nameWithoutExtension}")
                i++
            }
            println("${files.size+1} - To add note type \"A NEW NOTE NAME\"")
        } else
            println("---No note found---\n To add note type \"A NEW NOTE NAME\"")

    }

    fun selectFile(location: String) {
        println("Enter note name to Select/Create : ")
        val fileName = input.nextLine()
        val file = File("$location$fileName.txt")
        if (file.exists())
            noteHandler.read(file)
        else
            noteHandler.write(file.path)
    }

}