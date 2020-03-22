package javaPgm;

import javaPgm.Shape.ShapeType;

public class Shape {

	public enum ShapeType { CIRCLE , SQUARE , RECTANGLE , TRIANGLE };
	private final ShapeType type;

	// if it is a circle
	private final double circleRadius ;

	// if it is a triangle
	private final double triangleBase ;
	private final double triangleHeight ;
	private final double triangleSideA ;
	private final double triangleSideB ;
	private final double triangleSideC ;

	// if it a square
	private final double squareSideLength ;

	// if it is a rectangle
	private final double rectangleLength ;
	private final double rectangleWidth ;

	public Shape(final ShapeType type , final double circleRadius , final double
			triangleBase , final double triangleHeight , final double triangleSideA ,
			final double triangleSideB , final double triangleSideC , final double
			squareSideLength , final double rectangleLength ,
			final double rectangleWidth ) {


		this.type = type;
		this.circleRadius = circleRadius ;
		this.triangleBase = triangleBase ;
		this.triangleHeight = triangleHeight ;
		this.triangleSideA = triangleSideA ;
		this.triangleSideB = triangleSideB ;
		this.triangleSideC = triangleSideC ;
		this.squareSideLength = squareSideLength ;
		this.rectangleLength = rectangleLength ;
		this.rectangleWidth = rectangleWidth ;
	}

	public ShapeType getType() {
		return type;
	}

	public double getCircleRadius() {
		return circleRadius ;
	}

	public double getTriangleBase() {
		return triangleBase ;
	}

	public double getTriangleHeight() {
		return triangleHeight ;
	}

	public double getSquareSideLength() {
		return squareSideLength ;
	}

	public double getRectangleLength() {
		return rectangleLength ;
	}

	public double getRectangleWidth() {
		return rectangleWidth ;
	}

	public double getTriangleSideA() {
		return triangleSideA ;
	}

	public double getTriangleSideB() {
		return triangleSideB ;
	}

	public double getTriangleSideC() {
		return triangleSideC ;
	}
} // end of class Shape

 class InvalidShapeType extends Exception {
	private final ShapeType type;
	public InvalidShapeType(final ShapeType type) {
		this.type = type;
	}

	public ShapeType getType() {
		return type;
	}
} // end of class InvalidShapeType

class AreaCalculator {

	public double calculateArea(final Shape shape) throws InvalidShapeType {
		final ShapeType shapeType = shape.getType ();
		switch(shapeType) {
		case CIRCLE:
			return calculateCircleArea(shape);
		case SQUARE:
			return calculateSquareArea(shape);
		case RECTANGLE :
			return calculateRectangleArea(shape);
		case TRIANGLE:
			return calculateTriangleArea(shape);

		default:
			throw new InvalidShapeType(shapeType);
		}
	}

	private double calculateCircleArea (final Shape circle) {
		return Math.PI * Math.pow(circle.getCircleRadius(), 2);
	}

	private double calculateSquareArea (final Shape square) {
		return Math.pow(square.getSquareSideLength(), 2);
	}

	private double calculateRectangleArea(final Shape rectangle ) {
		return rectangle.getRectangleLength() * rectangle.getRectangleWidth();
	}


	private double calculateTriangleArea (final Shape triangle ) {
		return 0.5 * triangle.getTriangleHeight() * triangle.getTriangleBase();
	}
} // end of class AreaCalculator

class PerimeterCalculator {

	public double calculatePerimeter (final Shape shape) throws InvalidShapeType {
		final ShapeType shapeType = shape.getType();
		switch(shapeType) {
		case CIRCLE:
			return calculateCircleCircumference(shape);
		case SQUARE:
			return calculateSquarePerimeter(shape);
		case RECTANGLE :
			return calculateRectanglePerimeter(shape);
		case TRIANGLE:
			return calculateTrianglePerimeter(shape);

		default:
			throw new InvalidShapeType(shapeType);
		}
	}

	private double calculateCircleCircumference(final Shape circle) {
		return 2 * Math.PI * circle.getCircleRadius();
	}

	private double calculateSquarePerimeter(final Shape square) {
		return 4 * square.getSquareSideLength();
	}

	private double calculateRectanglePerimeter(final Shape rectangle ) {
		return 2 * ( rectangle.getRectangleLength() + rectangle.getRectangleWidth());
	}

	private double calculateTrianglePerimeter(final Shape triangle ) {
		return triangle. getTriangleSideA() + triangle.getTriangleSideB() + triangle.getTriangleSideC();
	}
} 
