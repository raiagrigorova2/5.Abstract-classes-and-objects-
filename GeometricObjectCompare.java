package AbstractClassesAndObjects;

public abstract class GeometricObjectCompare implements Comparable<GeometricObjectCompare>{

	public int compareTo(GeometricObjectCompare o) {
		return(Double.compare(this.getArea(),o.getArea()));
	}
	
	public abstract double getArea();
	public abstract void print();
	
	public static GeometricObjectCompare max(GeometricObjectCompare x, GeometricObjectCompare y) {
		//if both are equal, then it returns the first one.
		if(x.compareTo(y) == 1 || x.compareTo(y) == 0) return x;	
		return y;
	}

	/*
	 * ��������� ��������� �� ���������� Comparable � ����� ArrayList. ��������� ���
	 * ���������������� �� ���������� �� �������� ���������� �� ArrayList �� ����,
	 * �������� �� ���. ��������� ����� GeometricObject � ��������������� ����������
	 * Comparable, ����� �� �������� ������ �� ��������. ����������� �������� �����
	 * max � ����� GeometricObject �� �������� �� ��-������� �� ��� ������ �� �����
	 * GeometricObject.
	 */

}
