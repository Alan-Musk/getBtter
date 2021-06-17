using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace students {
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("请输入第一个数");
            int num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("请输入第二个数");
            int num2 = int.Parse(Console.ReadLine());

            Console.WriteLine("{0}+{1}={2}",num1,num2,sum(num1,num2));
            int sum(int num1,int num2)
            {
                int sum = num1 + num2;
                return sum;
            }
        }

    }
}