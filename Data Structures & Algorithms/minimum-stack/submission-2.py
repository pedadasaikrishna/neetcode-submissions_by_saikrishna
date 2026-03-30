class MinStack:

    def __init__(self):
        self.stack = []  # Main stack to store elements
        self.minStack = []  # Stack to store the minimum value at each step

    def push(self, val: int) -> None:
        self.stack.append(val)
        # Push the minimum so far into minStack
        if not self.minStack or val <= self.minStack[-1]:
            self.minStack.append(val)

    def pop(self) -> None:
        if self.stack:
            if self.stack[-1] == self.minStack[-1]:
                self.minStack.pop()  # Remove from minStack if it was the minimum
            self.stack.pop()  # Remove from main stack

    def top(self) -> int:
        return self.stack[-1] if self.stack else None  # Handle empty stack case

    def getMin(self) -> int:
        return self.minStack[-1] if self.minStack else None  # Handle empty stack case
