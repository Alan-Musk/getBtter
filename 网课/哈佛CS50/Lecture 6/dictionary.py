words = set()

def check(word):
    return word in words

def load(dictionary):
    file=open(dictionary,"r")
    for line in file:
        words.add(line.rstrip("\n"))
    file.close()
    return True

def size():
    return len(words)
    
def unload():
    return True