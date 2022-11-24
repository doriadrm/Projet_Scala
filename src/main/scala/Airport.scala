import java.io.File
import scala.io.Source

object Airport extends App{

   def Test1(): Unit ={
     val SFC = Source.fromFile(new File("C:\\Users\\Michou\\Downloads\\Projet_Scala\\ressources\\airports.csv")).getLines()
     SFC.map(_.split(","))
     SFC.foreach(print)
  }
/* Un test pour parse
  def Test2(): Unit = {
    val SFC = Source.fromFile(new File("C:\\Users\\Michou\\Downloads\\Projet_Scala\\ressources\\countries.csv")).getLines().toVector
    parseCsvLine(SFC)
  }

  def parseCsvLine(line: String): Option[Data] = {
    line.split(";").toVector.map(_.trim) match {
      case Vector(date, time, longitude, latitude) => Some(Data(date, time, longitude, latitude))
      case _ => println(s"WARNING UNKNOWN DATA FORMAT FOR LINE: $line")
        None
    }
  }

 */

  def Test3(): Unit = {
    val SFC = Source.fromFile(new File("C:\\Users\\Michou\\Downloads\\Projet_Scala\\ressources\\runways.csv")).getLines()
    SFC.map(_.split(","))
    SFC.foreach(print)
  }

  Test1()
}
