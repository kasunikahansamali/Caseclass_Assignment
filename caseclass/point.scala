import scala.math.sqrt
import scala.math.pow
object CaseClass{

  case class Point(x:Int,y:Int)
  {
    def a:Int=x
    def b:Int=y

    //Addition of given two points
    def +(that:Point)=Point(this.x+that.x,that.y+this.y)

    //moving points by a given distance dex and dy
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

    //distance between two points
    def distance(a:Point)=Point(this.x-a.x,this.y-a.y)
    
    //inverse of point
    def invert()=Point(this.y,this.x)
  }



def main(args: Array[String]): Unit = {
  val point1=new Point(10,7)
  val point2=new Point(5,8)
  val point3=new Point(12,15)
  println(point1+point2)
  println(point1.move(2,1))
  println(point3.distance(point2))
  println(point1.invert())
}
}