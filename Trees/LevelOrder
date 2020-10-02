import queue
class node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
def levelorder(root):
    if not root:
        return
    q = queue.Queue()
    q.put(root)
    res = []
    while not q.empty():
        node = q.get()
        res.append(node.data)
        if node.left is not None:
            q.put(node.left)
        if node.right is not None:
            q.put(node.right)
    return res
root = node(1)
root.left = node(2)
root.right = node(3)
root.left.left = node(4)
root.left.right = node(5)
root.right.left = node(6)
root.right.right = node(7)
print(levelorder(root))
