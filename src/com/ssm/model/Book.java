package com.ssm.model;

public class Book {
		private long bookId;// ͼ��ID
		
		private String name;// ͼ������

		private int number;// �ݲ�����

		public long getBookId() {
			return bookId;
		}

		public void setBookId(long bookId) {
			this.bookId = bookId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
}
