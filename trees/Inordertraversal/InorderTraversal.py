class node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
def inorder(root):
    if not root:
        return
    stack = []
    stack.append(root)
    res = []
    while stack:
        node = stack.pop()
        res.append(node.data)
        if node.right is not None:
            stack.append(node.right)
        if node.left is not None:
            stack.append(node.left)
    return res
root = node(1)
root.left = node(2)
root.right = node(3)
root.left.left = node(4)
root.left.right = node(5)
root.right.left = node(6)
root.right.right = node(7)
print(inorder(root))
