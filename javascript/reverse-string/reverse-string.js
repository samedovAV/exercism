// Built-In Functions
function reverseStringBuiltIn(str) {
  return str.split('').reverse().join('');
}

// Spread Operator
function reverseStringSpreadOperator(str) {
  return [...str].reverse().join('');
}

// For Loop Approach
function reverseStringForLoop(str) {
  let reversedStr = '';
  for (let i = str.length - 1; i >= 0; i--) {
    reversedStr += str[i];
  }
  return reversedStr;
}

// Recursion Approach (Ternary)
function reverseStringRecursionTernary(str) {
  return (str === '') ? '' : reverseStringRecursionTernary(str.substr(1)) + str.charAt(0);
}

