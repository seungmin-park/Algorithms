public class SingleLinkedList<T>{
    public Node<T> head = null;
    
    static class Node<T>{
        T data;
        Node<T> next = null;
        
        public Node(T data){
            this.data = data;
        }
    }
    
    //맨 뒤에 노드 추가
    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        }else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }
    
    //중간에 노드 추가
    public void addNode(T data,T isData){
        Node<T> searchedNode = this.search(isData);
        if(searchedNode == null){
            this.addNode(data);
        }else{
            Node<T> newNode = new Node<T>(data);
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
        }
    }
    
    //노드 찾기
    public Node<T> search(T data){
        if(this.head == null){
            return null;
        }else{
            Node<T> node = this.head;
            while(true){
                if(node.data == data){
                    return node;
                }else if(node.next == null){
                    return null;
                }else{
                node = node.next;                    
                }
            }
        }
    }
    
    //노드 삭제
    public void deleteNode(T data){
        Node<T> searchedNode = this.search(data);
            if(searchedNode == null){
                //삭제할 노드가 존재하지 않는 경우
                System.out.println("Node not existed");
            }
            else if(searchedNode == this.head){
                //맨 앞 노드 삭제
                this.head = searchedNode.next;
                searchedNode.next = null;
            }else{
                Node<T> node = this.head;
                while(node.next.data != data){
                    node = node.next;
                }
                node.next = searchedNode.next;
                searchedNode.next = null;
            }
        }
    
    //리스트의 모든 노드 출력
    public void printAllData(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }else{
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
}