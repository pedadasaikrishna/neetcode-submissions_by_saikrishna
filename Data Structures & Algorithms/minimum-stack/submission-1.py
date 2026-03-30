class MinStack:

    def __init__(self):
        self.stack=[]
        self.Min=float('inf')

    def push(self, val: int) -> None:
        self.stack.append(val)
        if val<self.Min:
            self.Min=val
        

    def pop(self) -> None:
        if self.stack:
            x=self.stack.pop()
            if x==self.Min:
                self.Min=min(self.stack)
        
        

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.Min
