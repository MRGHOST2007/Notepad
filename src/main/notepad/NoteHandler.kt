import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.util.Scanner

class NoteHandler(){

    fun read(file: File){
        val fileReader = FileReader(file)
        val scanner = Scanner(fileReader)
        println("Note \"${file.nameWithoutExtension}\" Content : ")
        while (scanner.hasNext()) {
            println(scanner.nextLine())
        }
        fileReader.close()
    }

    fun write(file: String){
        val scanner = Scanner(System.`in`)

        val fileWriter = FileWriter(file)

        println("Write your note (Enter \"SAVE\" to save file) : ")
        var data = ArrayList<String>()
        data.add(scanner.nextLine())
        while (data[data.size-1] != "SAVE") {
            data.add(scanner.nextLine())
        }
        for (item in 0..<data.size-1) {
            fileWriter.write(data[item]+"\n")
        }
        fileWriter.close()
    }

}