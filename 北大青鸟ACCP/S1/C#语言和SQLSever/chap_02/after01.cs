using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace after{
    class Program
    {
        public static void Main(string[] args)
        {
            int[] number = new int[] { 1, 2, 3, 4, 5 };
            foreach (int item in number)
            {
                if (item == 3)
                {
                    continue;
                }
                if (item==5)
                {
                    break;
                }
                Console.WriteLine(item);
            }
        }
    }
}