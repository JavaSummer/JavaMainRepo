import java.math.*;

class Functions{
	private static Functions instance = null;
	protected Functions(){
		
	}
	public static Functions getInstance(){
		if(instance == null){
			instance = new Functions();
		}
		return instance;
	}
	
	public void printMatrix(BigDecimal[][] matrix1){
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length;j++){
				System.out.print(String.format("%s\t", matrix1[i][j]) );
			}
			System.out.println();
		}
	}
	public BigDecimal[][] add(BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		BigDecimal[][] result = new BigDecimal[matrix1.length][matrix1.length];
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				result[i][j] = matrix1[i][j].add(matrix2[i][j]);
			}
		}		
		return result;
	}
	public BigDecimal[][] subtract(BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		BigDecimal[][] result = new BigDecimal[matrix1.length][matrix1.length];
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				result[i][j] = matrix1[i][j].subtract(matrix2[i][j]);
			}
		}		
		return result;
	}
	public BigDecimal[][] multiply(BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		BigDecimal[][] result = new BigDecimal[matrix1.length][matrix1.length];
		//Initialize the result with 0
		for(int i=0;i<matrix1.length;i++){
			for(int j=0; j<matrix1.length; j++){
				result[i][j] = BigDecimal.ZERO;
			}
		}
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				for(int k=0; k<matrix1.length; k++){
					result[i][j] = result[i][j].add(matrix1[i][k].multiply(matrix2[k][j]));
				}
			}
		}		
		return result;
	}
	public BigDecimal[][] multiplyScalar(BigDecimal[][] matrix1, BigDecimal scalar){
		BigDecimal[][] result = new BigDecimal[matrix1.length][matrix1.length];
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				result[i][j] = matrix1[i][j].multiply(scalar);
			}
		}
		
	return result;
	}

	public BigDecimal determinant(BigDecimal[][] matrix1){
		BigDecimal result = new BigDecimal(0);
		BigDecimal sign;
		//1x1 Matrix
		if(matrix1.length==1){
			result = matrix1[0][0];
		}
		else if(matrix1.length==2){
			result = matrix1[0][0].multiply(matrix1[1][1]).subtract(matrix1[0][1].multiply(matrix1[1][0]));
		}
		else{
		    for(int i=0;i<matrix1.length;i++){ //finds determinant using row-by-row expansion
		        BigDecimal[][] smallerDet = new BigDecimal[matrix1.length-1][matrix1.length-1]; //creates smaller matrix- values not in same row, column
		        for(int a=1;a<matrix1.length;a++){
		          for(int b=0;b<matrix1.length;b++){
		            if(b<i){
		              smallerDet[a-1][b]=matrix1[a][b];
		            }
		            else if(b>i){
		              smallerDet[a-1][b-1]=matrix1[a][b];
		            }
		          }
		        }
		        if(i%2==0){ //sign changes based on i
		          sign=BigDecimal.valueOf(1);
		        }
		        else{
		          sign=BigDecimal.valueOf(-1);
		        }
		        result=result.add(sign.multiply(matrix1[0][i].multiply(determinant(smallerDet))));
		        }
		    }
		return result;
	}

	protected BigDecimal[][] columnSwapper(BigDecimal[][] matrix1, BigDecimal[] rightSide, int column){
		BigDecimal[][] result = new BigDecimal[matrix1.length][matrix1.length];
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				result[i][j] = matrix1[i][j];
			}
		}
		for(int i=0; i<matrix1.length; i++){
			result[i][column] = rightSide[i];
		}
		return result;
	}
	public BigDecimal[] systemSolver(BigDecimal[][] matrix1, BigDecimal[] rightSide){
		BigDecimal[] result = new BigDecimal[matrix1.length];
		BigDecimal det = determinant(matrix1);
		BigDecimal det1;
		// If the main determinant is 0, the system is incompatible
		if(det.compareTo(BigDecimal.ZERO)!=0){
			for(int i=0; i<matrix1.length; i++){
				det1 = determinant(columnSwapper(matrix1, rightSide, i));
				result[i] = det1.divide(det);
			}
		}
		return result;
	}
	public boolean areEqual(BigDecimal[][] matrix1, BigDecimal[][] matrix2){
		boolean result = true;
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				if(matrix1[i][j].compareTo(matrix2[i][j]) != 0) result = false;
			}
		}
		return result;
	}
	public boolean isZeroMatrix(BigDecimal matrix1[][]){
		boolean result = true;
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix1.length; j++){
				if(matrix1[i][j].compareTo(BigDecimal.ZERO) != 0) result = false;
			}
		}
		
		return result;
	}
	public boolean isIdentityMatrix(BigDecimal matrix1[][]){
		boolean result = true;
		for(int i=0; i<matrix1.length; i++){
			if(matrix1[i][i].compareTo(BigDecimal.ONE) != 0) result = false;
		}
		return result;
	}
	public BigDecimal fillDegree(BigDecimal[][] matrix1){
		BigDecimal fillDegree = new BigDecimal(0);
		BigDecimal elements = new BigDecimal(matrix1.length);
		BigDecimal nonZero = new BigDecimal(0);
		for(int i=0; i<matrix1.length;i++){
			for(int j=0; j<matrix1.length;j++){
				if(matrix1[i][j].compareTo(BigDecimal.ZERO) != 0){
					nonZero = nonZero.add(BigDecimal.ONE);
				}
			}
		}
		if(nonZero.compareTo(BigDecimal.ZERO) == 0) fillDegree=BigDecimal.ONE;
		else fillDegree = nonZero.divide(elements.multiply(elements));
		return fillDegree;
	}


}


public class MatrixOperations {
	

	public static void main(String[] args) {
		BigDecimal[][] Matrix1 = new BigDecimal[2][2];
		BigDecimal[][] Matrix2 = new BigDecimal[2][2];
		BigDecimal[] result = new BigDecimal[2];
		result[0] = new BigDecimal(2);
		result[1] = new BigDecimal(0);
		Matrix1[0][0] = new BigDecimal(1);
		Matrix1[0][1] = new BigDecimal(1);
		Matrix1[1][0] = new BigDecimal(1);
		Matrix1[1][1] = new BigDecimal(-1);
				
		Matrix2[0][0] = new BigDecimal(1);
		Matrix2[0][1] = new BigDecimal(0);
		Matrix2[1][0] = new BigDecimal(0);
		Matrix2[1][1] = new BigDecimal(1);

		Functions instance = new Functions();
		BigDecimal[] solutions = instance.systemSolver(Matrix1, result);
		System.out.println();
		System.out.println("Sol: ");
		for(int i=0; i<solutions.length; i++) System.out.print(solutions[i] + " ");
		System.out.printf("%nMatrix: %n");
		instance.printMatrix(instance.multiply(Matrix1, Matrix2));
		
	}

}
