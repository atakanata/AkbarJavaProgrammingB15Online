package day27;

public class clasNote {
    public static void main(String[] args) {
        /*
       12/15/2019
Topics:
		Arrays Reveiw
		Multi-Dimensional arrays


Single dimensional array: contains multiple values
			int[] arr= {1, 2, 3}
			// index:   0  1  2

			retrive:
				variableName[indexNum]

				ex:
					arr[2] ==> 3

		Array's size is fixed


		creating array:
			int[] arr ={1,2,3};
			int[] arr2 = new int[]{1,2,3};
			int[] arr3 = new int[5];


Multi Dimensional Array: an array that can contain arrays
				N dimesional array conatins (N-1) dimensional arrays

		Ex: 2 dimensional arrays: contains 1 demensional arrays

			length of 2D array is determined by the numbers of 1D arrays

			int[][] arr2D = { {1,2,3}, {4,5,6}   };

			[index num of 1D array][index num of elements]

			arr2D[0][1] ==>  2
			arr2D[1]  ==> {4,5,6}

	creating 2dArray:
		int[][] arr2D = { {1,2,3}, {4,5,6}};
		int[][] arr2D = new int[][] { {1,2,3}, {4,5,6}};
		int[][] arr2D = new int[lengthNumber][];


	Ex: 3D array: contains 2D arrays

		length of the 3D array is determind by the numbers of 2D array

		int[][][]  arr3D = { {{1,2,3}, {4,5,6}} ,  {{7,8}, {9}}  };

   		[index num of 2D array][index num of 1D array][index num of elemnts]

   		retrive:
   			arr3D[1][1][0] ==> element : 9
   			arr3D[1]  ==> 2Darray: {{7,8}, {9}}
   			arr3D[1][0] ==> 1Darray: {7,8}




Arrays util class:
		Arrays.toString(): converts single dimentional array to String, returns it as String

		Arrays.deepToString(): converts multi-dimensional array to String, returns it as String

		Arrays.sort(): sorts the single dimensional array, in ascending order


         */


    }
}
