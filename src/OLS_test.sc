def transpose(matrix: Array[Array[Double]]):  Array[Array[Double]] = {
  matrix.head.indices.map(i => matrix.map(_(i))).toArray
}

def multiply(a: Array[Array[Double]], b: Array[Array[Double]]): Array[Array[Double]] = {
  /*
  for row in a
    for col in b
      grab the dot product of a and b, and put it into a new vector
   */
  val b_transpose = transpose(b)
  for (row <- a) yield for (col <- b_transpose) yield row.zip(col).map{
    case (x, y) => x * y
  }.sum
}

def gaussianElimination(matrix: Array[Array[Double]]):  Array[Array[Double]] = {
  val size =  matrix.length
  val augmented = matrix.zipWithIndex.map {
    case (row, i) => row ++ Array.fill(size)(0.0).updated(i, 1.0)
  } //here i is the ith row, and i index 1 to that value
  for (i <- 0 until(size)) {
    val diagonalElement = augmented(i)(i) //diagonals along the original matrix
    for (j <- 0 until 2 * size) augmented(i)(j) /= diagonalElement //divide by diagonalElement
    for (k <- 0 until size if k != i) { //elemination step, subtract out the normaliaztion term
      val factor = augmented(k)(i)
      for (j <- 0 until 2 * size) augmented(k)(j) -= factor * augmented(i)(j)
    }
  }
}
val X = Array(
  Array(1.0, 1.0),
  Array(1.0, 2.0),
  Array(1.0, 3.0),
  Array(1.0, 4.0)
)
transpose(X)