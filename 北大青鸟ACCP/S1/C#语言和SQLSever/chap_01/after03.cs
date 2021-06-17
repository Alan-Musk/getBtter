using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace MyCar{
    public class Car
    {
        public string name;//汽车名称
        public string color;//颜色
        public string productPlace;//产地

        public void Getcar()
        {
            Console.WriteLine("请输入汽车名称");
            name=Console.ReadLine();
            Console.WriteLine("请输入汽车颜色");
            color=Console.ReadLine();
            Console.WriteLine("请输入汽车产地");
            productPlace= Console.ReadLine();
        }
        public void Show()
        {
            Console.WriteLine("汽车名称:{0} 颜色:{1} 产地:{2}",name,color,productPlace);
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            Car car = new Car();
            car.Getcar();
            car.Show();
        }
    }
}