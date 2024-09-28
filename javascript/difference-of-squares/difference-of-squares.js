export class Squares {
  constructor(n) {
    // Validate
    if (n < 1) {
      throw new Error("Input must be a positive integer");
    }
    this.n = n;
  }

  get sumOfSquares() {
    // Calculate the sum if the squares of the first n natural numbers
    return (this.n * (this.n + 1) * (2 * this.n + 1)) / 6;
  }

  get squareOfSum() {
    // Calculate the square of the sum of the first n natural numbers
    const sum = (this.n * (this.n + 1)) / 2;
    return Math.pow(sum, 2);
  }

  get difference() {
    // Calculate the difference between the square of the sum and the sum of squares
    return this.squareOfSum - this.sumOfSquares;
  }
}
