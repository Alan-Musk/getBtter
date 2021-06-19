using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace School{
    //学员类
    public class Student
    {
        public string name;//姓名
        public double score;//成绩
        public void showInfo()
        {
            //输出信息
            Console.WriteLine("{0}\t{1}",name,score);
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            //定义对象数组
            Student[] stus = new Student[3];
            //为数组元素赋值
            stus[0] = new Student();
            stus[0].name = "alan";
            stus[0].score = 100;
            stus[1] = new Student();
            stus[1].name = "elon";
            stus[1].score = 90;
            stus[2] = new Student();
            stus[2].name = "july";
            stus[2].score = 20;
            Console.WriteLine("前三名的信息为:");
            foreach (Student stu in stus)
            {
                stu.showInfo();
            }
            Console.ReadLine();
        }
    }
}