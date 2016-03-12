/**
 * Created by 1 on 12.03.2016.
 */
public class List {
    private int value;
    private List next;
    private static List head;
    private static int size = 0;

    public void Insert(int newValue) {
                        //Первый добавленный элемент списка становится головой.
        if(size == 0){
            this.value = newValue;
            head = this;
            size++;
        }
        else {
            List newElement = new List();
            newElement.setValue(newValue);
                        //Для упрощения второй элемент ссылается на голову, а голова на него.
            if(size == 1) {
                newElement.next = head;
                this.next = newElement;
            }
                        //Если размер списка становится больше двух, то нужно проверить куда нам вставить новый элемент.
            else {
                List buffElement = head;
                for (int i = 0; i < size; i++) {
                        //Вставляем элемент, если он больше текущего и меньше следующего.
                    if ((buffElement.getValue() < newElement.getValue() && buffElement.getNext().getValue() > newElement.getValue())) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //Вставляем элемент,если он больше всех элементов в массиве.
                    else if ((buffElement.getValue() < newElement.getValue() && buffElement.getNext().getValue() < newElement.getValue()) && (buffElement.getNext().getValue() < buffElement.getValue())) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //Вставляем элемент, если он меньшке всех элементов в массиве.
                    else if ((buffElement.getValue() > newElement.getValue() && buffElement.getNext().getValue() > newElement.getValue()) && (buffElement.getNext().getValue() < buffElement.getValue())) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //Если элемент с таким же значением уже есть в списке, то вставляем новый рядом с ним.
                    else if (buffElement.getValue() == newElement.getValue()) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //Если не одно из правил не подошло берём следующий элемент списка и снова проверяем.
                    else {
                        buffElement = buffElement.getNext();
                    }
                }
            }
            size++;
        }
    }

    public int getValue() {
        return value;
    }

    public List getNext(){
        return next;
    }

    public void setNext(List next){
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void writeAllList() {
        List buff = head;
        for (int i = 0; i < size; i++) {
            System.out.println(buff.getValue());
            buff = buff.getNext();
        }
    }
}
