/**
 * Created by Ivan Shulga on 12.03.2016.
 * Задача 1. Циклический список
 */
public class Solver {

    public static void main(String[] args) {
            //Инициализируем список и добавляем элементы
        List myList = new List();
        myList.Insert(4);
        myList.Insert(7);
        myList.Insert(9);
        myList.Insert(9);
        myList.Insert(1);
        myList.Insert(10);
        myList.Insert(88);
        myList.Insert(44);
        myList.Insert(99);

            //Вывод на экрран всего списка
        myList.writeAllList();
    }
}
