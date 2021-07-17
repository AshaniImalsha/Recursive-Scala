import java.util.Scanner;
import scala.io.StdIn.readInt;

object question_06{

	def fibonacci(m:Int): Int=m match{
        	case 0 => 0
		case x if x==1 => 1
		case _ => fibonacci(m-1)+fibonacci(m-2)
   	}

	def fibonacciSeq(m:Int) : Unit={
		if (m>0) fibonacciSeq(m-1)
		println(fibonacci(m))
	}

	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Fibonacci Sequence\n");
		print("Enter number :");
		val num=input.nextInt();

		fibonacciSeq(num)

	}
}

