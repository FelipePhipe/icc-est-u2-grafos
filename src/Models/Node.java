package Models;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private int value;
    private Set<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<Node> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Node neighbor) {
    if (neighbor != this) {           // evita self-loop
        neighbors.add(neighbor);      // HashSet evita duplicados
    }
}

    /*@Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node node = (Node) obj;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }*/
}
