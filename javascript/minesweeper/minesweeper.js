export const annotate = (board) => {
  const rows = board.length;
  const cols = board[0]?.length || 0;
  if (rows === 0 || cols === 0) return board;

  const directions = [
      [-1, -1], [-1, 0], [-1, 1],
      [0, -1],         [0, 1],
      [1, -1], [1, 0], [1, 1]
  ];

  const isInBounds = (r, c) => r >= 0 && r < rows && c >= 0 && c < cols;
  const result = board.map(row => row.split(''));

  // Directly process board without separate mine collection
  board.forEach((row, r) => {
      row.split('').forEach((cell, c) => {
          if (cell === '*') {
              directions.forEach(([dr, dc]) => {
                  const nr = r + dr, nc = c + dc;
                  if (isInBounds(nr, nc) && board[nr][nc] === ' ') {
                      result[nr][nc] = (result[nr][nc] === ' ' ? 1 : +result[nr][nc] + 1).toString();
                  }
              });
          }
      });
  });

  return result.map(row => row.join(''));
};