package test;

import com.MidoHegazi.linkedLists.doublylinkedlist.DoublyLinkedList;
import com.MidoHegazi.linkedLists.doublylinkedlist.DoublyNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

	DoublyLinkedList list;

	@BeforeEach
	public void setUp(){
		list = new DoublyLinkedList();
	}

	@Test
	@DisplayName("creating list test")
	void createLinkedList(){
		DoublyNode actual= list.createList(5);
		//assertEquals(6,actual.getValue(),"the value is not matching");
		assertEquals(5,actual.getValue());
		}
	@Test
	public void printDoublyLinkedList(){
		list.printDLL();

	}

	}

