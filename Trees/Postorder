class node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
def postorder(root):
    if not root:
        return
    sets = set()
    stack = []
    node = root
    res = []
    while stack or node:
        if node:
            stack.append(node)
            node = node.left
        else:
            node = stack.pop()
            if node.right and not node.right in sets:
                stack.append(node)
                node = node.right
            else:
                sets.add(node)
                res.append(node.data)
                node = None
    return res
root = node(1)
root.left = node(2)
root.right = node(3)
root.left.left = node(4)
root.left.right = node(5)
root.right.left = node(6)
root.right.right = node(7)
print(postorder(root))
