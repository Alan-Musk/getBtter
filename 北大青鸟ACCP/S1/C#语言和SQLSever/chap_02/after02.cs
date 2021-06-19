using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace after{
    class Program
    {
        public static void Main(string[] args)
        {
            int s = 0;
            for (int i = 0; i <=5; i++)
            {
                for (int j = 1; j <=i; j++)
                {
                    Console.Write(s);
                }
                Console.WriteLine("");
                s++;
            }
        }
    }
}