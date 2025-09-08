import java.io.File
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {

    val notesMenuHandler = NotesMenuHandler()

    val user = System.getProperty("user.name")
    val time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"))
    println("Hello $user \t$time\n --------")

    var location = "C:\\Users\\$user\\Documents\\Notepad\\"

    if (!File(location).isDirectory) {
        File(location).mkdir()
    }

    notesMenuHandler.listFiles(location,"Notes")
    println("--------")
    notesMenuHandler.selectFile(location)

}