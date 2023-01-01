package com.MidoHegazi.linkedLists.doublylinkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

	@Test
	@DisplayName("creating list test")
	void createLinkedList(){
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyNode actual= list.createList(5);
		assertEquals(6,actual.getValue(),"the value is not matching");
		}


	}

