/**
 * Created by 1 on 12.03.2016.
 */
public class List {
    private int value;
    private List next;
    private static List head;
    private static int size = 0;

    public void Insert(int newValue) {
                        //������ ����������� ������� ������ ���������� �������.
        if(size == 0){
            this.value = newValue;
            head = this;
            size++;
        }
        else {
            List newElement = new List();
            newElement.setValue(newValue);
                        //��� ��������� ������ ������� ��������� �� ������, � ������ �� ����.
            if(size == 1) {
                newElement.next = head;
                this.next = newElement;
            }
                        //���� ������ ������ ���������� ������ ����, �� ����� ��������� ���� ��� �������� ����� �������.
            else {
                List buffElement = head;
                for (int i = 0; i < size; i++) {
                        //��������� �������, ���� �� ������ �������� � ������ ����������.
                    if ((buffElement.getValue() < newElement.getValue() && buffElement.getNext().getValue() > newElement.getValue())) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //��������� �������,���� �� ������ ���� ��������� � �������.
                    else if ((buffElement.getValue() < newElement.getValue() && buffElement.getNext().getValue() < newElement.getValue()) && (buffElement.getNext().getValue() < buffElement.getValue())) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //��������� �������, ���� �� ������� ���� ��������� � �������.
                    else if ((buffElement.getValue() > newElement.getValue() && buffElement.getNext().getValue() > newElement.getValue()) && (buffElement.getNext().getValue() < buffElement.getValue())) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //���� ������� � ����� �� ��������� ��� ���� � ������, �� ��������� ����� ����� � ���.
                    else if (buffElement.getValue() == newElement.getValue()) {
                        newElement.next = buffElement.getNext();
                        buffElement.setNext(newElement);
                        break;
                    }
                        //���� �� ���� �� ������ �� ������� ���� ��������� ������� ������ � ����� ���������.
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
