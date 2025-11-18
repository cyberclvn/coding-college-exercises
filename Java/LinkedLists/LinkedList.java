package LinkedLists;

public class LinkedList {
    private Node head;
    
    public LinkedList(){
        head = null;
    }

    public Node getHead(){
        return head;    
    }

    public boolean isEmpty(){
        return getHead() == null;
    }

    public boolean isFull(){
        Node aux = new Node();
        return aux == null;
    }

    public  boolean insertHead(int id){
        Node aux;
        if (!isFull()){
            aux = new Node(id, null);
            if(isEmpty()){
                head = aux; 
            }else{
                aux.setProx(head);
                head = aux;
            }
            return true;
        }
        else return false;
    }

    public boolean insertTail(int id){
        Node aux, pAnda;
        if(!isFull()){
            aux = new Node(id, null);
            if(isEmpty()){
                head = aux;
            }else{
                pAnda = head;
                while(pAnda.getProx() != null){
                    pAnda = (pAnda.getProx());
                }
                pAnda.setProx(aux);
            }
            return true;
        }
        else return false;
    }

    public Node search(int id){
        Node pAnda;
        if(isEmpty()){
            return null;
        }else{
            pAnda = head;
            while(pAnda.getId() != id){
                pAnda = pAnda.getProx();
            }
            return pAnda;
        }
    }

    public boolean remove(int id){
        Node pAnt = null; 
        Node pAnda;

        if(isEmpty()) return false;
        else{
            pAnda = head;
            while((pAnda.getId() != id) && (pAnda != null)){
                pAnt = pAnda;
                pAnda = pAnda.getProx();
            }
            if (pAnda == null) return false;
            else{
                if(head == pAnda){
                    head = pAnda.getProx();
                }else{
                    pAnt.setProx(pAnda.getProx()); 
                }
                pAnda = null;
                return true;
                  
            }
        }
    }

    public void print(){
        Node pAnda;
        
            
            System.out.print("L: [ ");
            pAnda = head;
            while (pAnda != null){
                System.out.print(pAnda.getId()+" ");
                pAnda = pAnda.getProx();
                
                
            }
            System.out.println("]\n");
        
    }

    public void clear(){
        Node pAnt;
        Node pAnda = head;

        while(pAnda.getProx() != null){
            pAnt = pAnda;
            pAnda = pAnda.getProx();
            pAnt.setProx(null);
            pAnt = null;
        }
        head = null;
    }

    public int contElemList(){
        Node pAnda = head;
        int cont = 0;
        while(pAnda != null){
            cont += 1;
            pAnda = pAnda.getProx();
        }
        return cont;
    }

    //extra method #1 
    public void insertElemCres(int id){
        Node pAnt = null;
        Node pAnda = head;
        Node aux = new Node(id, null);
        
        if(!isEmpty()){
                while((pAnda != null) && pAnda.getId() < id){
                pAnt = pAnda;
                pAnda = pAnda.getProx();
            }
            if(pAnda == head){
                head = aux;
                aux.setProx(pAnda);
            }else if(pAnda == null){
                pAnt.setProx(aux);
            }
            else{
                pAnt.setProx(aux);
                aux.setProx(pAnda);
            } 
        }else{
            head = aux;
        }

    }

    //extra method #2
    public void insertElemDec(int id){
            
        Node pAnt = null;
        Node pAnda = head;
        Node aux = new Node(id, null);
        
        if(!isEmpty()){
                while((pAnda != null) && pAnda.getId() > id){
                pAnt = pAnda;
                pAnda = pAnda.getProx();
            }
            if(pAnda == head){
                head = aux;
                aux.setProx(pAnda);
            }else if(pAnda == null){
                pAnt.setProx(aux);
            }
            else{
                pAnt.setProx(aux);
                aux.setProx(pAnda);
            } 
        }else{
            head = aux;
        }

    }
    



}
