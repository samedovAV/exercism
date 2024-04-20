export const primes = (n) => {
  if (n < 2) return [];
  const primes = Array.from({ length: n + 1 }, (_, i) => i >= 2);
  for (let p = 2; p * p <= n; p++) {
    if (primes[p]) {
      for (let i = p * p; i <= n; i += p) {
        primes[i] = false;
      }
    }
  }

  return primes.reduce((acc, val, index) => val ? [...acc, index] : acc, []).slice(0);
};
