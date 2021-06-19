using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ArrayInit{
    class Program
    {
        public static void Main(string[] args)
        {
            int[] array = new int[5] { 0, 1, 2, 3, 4 };
            Console.WriteLine("数组array中{0}个元素的值是:",array.Length);
            for (int i = 0; i < array.Length; i++)
            {
                Console.WriteLine(array[i]+"");
            }
            Console.WriteLine();
            Console.ReadLine();
        }
    }
}