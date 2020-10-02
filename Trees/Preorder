class node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
def preorder(root):
    if not root:
        return
    stack = []
    node = root
    res = []
    while stack or node:
        if node:
            stack.append(node)
            node = node.left
        else:
            node = stack.pop()
            res.append(node.data)
            node = node.right
    return res
root = node(1)
root.left = node(2)
root.right = node(3)
root.left.left = node(4)
root.left.right = node(5)
root.right.right = node(6)
root.right.left = node(7)
print(preorder(root))
