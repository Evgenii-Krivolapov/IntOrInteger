public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ���� �������� ��� ��� ���������� �������:
        //  � ������� ����� � �������������� ����� � ������� ������� ��� ����
        //  ���� �������� �������� � ��������� � ��������, � ��� ����� ����� �.
    }

    public static void Alphabet() {
        for (int i = 0; i < 65536; i++) {
            if (i == '�' || i == '�') {
                System.out.println(i + " - " + (char) i);
            } else if (i >= '�' && i <= '�') {
                System.out.println(i + " - " + (char) i);
            }
        }
    }

}
