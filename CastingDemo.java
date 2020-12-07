package AbstractClassesAndObjects;

class CastingDemo {

	public static void main(String[] args) {
//		����������� � ��������� ������� ���.
//		����� ������ ��� ����� instanceof?
//		����� ������ ��� ������ ((Circle)object).getArea())
//		� ((Rectangle)object).getArea())? ����������� �����������
//		�� ��������, ���� ����� ���������� instanceof
//		� �������� �� ���� ����� ��� ����?
		
//�������: ���������� instanceof �� ��������, �� �� �� ������� ���� 
//����� ����� � ��������� �� ����� ��� (����, ������� ��� ���������)
//�������� �� ��������� � ��� � �� ����� ��� true, ��� false. 
//��� �� �������� � ���������� = null, �� ����� false.
		
//��� ((Circle)object).getArea()) cast-���� object (����� � ��������� �� ���-������� 
//superclass - Object, extend-��� �� ������ �������) �� ����� �� ���� Circle,
//��� object � ��������� �� Circle.
		
//instanceof � �������� �� ���� ����� ��� ����
//���� �� �� �������� �������� � GeometricObject (����� � �������), 
		Object object1 = new CircleCompare(1);
		Object object2 = new RectangleCompare(1, 1);
		// Display circle and rectangle
		displayObject(object1);
		displayObject(object2);

	}
	
	public static void displayObject(Object object) {
		if (object instanceof CircleCompare) {
		System.out.println("The circle area is " +
		((CircleCompare)object).getArea());
		System.out.println("The circle diameter is " +
		((CircleCompare)object).getRadius() * 2);
		}
		else if (object instanceof RectangleCompare) {
		System.out.println("The rectangle area is " +
		((RectangleCompare)object).getArea());
		}
	}
}



