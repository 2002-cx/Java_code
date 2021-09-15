#include<stdio.h>
#include<malloc.h>
//定义结构体
typedef struct node{
	int data;//数据
	struct node * next;//存放下一个地址的指针
}node;
node *head = NULL;//定义一个全局变量的头为空
void head_insert(int data);//声明——头插
void display();
void init(int data);
void nail_insert(int data);
void insert(int loc, int data);
int main(){
	init(1);//结构体初始化
	/*
	head_insert(11);
	head_insert(112);
	head_insert(113);
	nail_insert(115);
	nail_insert(1152);
	insert(1,23);
	insert(6, 233);
	*/
	insert(1, 23);
	insert(2, 33);
	insert(3, 44);
	display();
	return 0;
}
void insert(int loc, int data){
	node * p = (node *)malloc(sizeof(node));//初始化要插入的新空间
	node * temp = head;//将head给临时变量temp，为了循环遍历
	node * before = NULL;//因为before记录的是temp前面的值，所以temp为第一个值，即before就为空
	int i = 1;//循环到目标位置
	p->data = data;//将插入的值放在临时变量中
	p->next = NULL;//下一个的地址指向空
	if (loc == 1){
		//如果是头插，则调用头插函数
		head_insert(loc);
	}
	else{
		//否则的话，就是在中间插了，两种情况
		//1、插入的位置有效
		//2、插入的位置无效，遍历了整个链表都没找到，提示一下
		while (temp->next != NULL&&loc != i)
		{
			before = temp;
			temp = temp->next;//将temp指向最后一个位置的地址
			i++;
		}
		if (i == loc)//第一种情况
		{

			before->next = p;
			p->next = temp;
		}
		else if (temp == NULL)
		{
			//尾插
			nail_insert(data);
		}
		//第二种情况
		else{
			printf("\n位置无效!");
		}
	}
}
void nail_insert(int data){
	node *temp = head;
	node *p = (node*)malloc(sizeof(node));
	while (temp->next != NULL)
	{
		temp = temp->next;
	}
	temp->next = p;//temp的地址经过循环遍历后，现在所指向的地址为最后一个链表的元素，将要插入的地址放在temp中
	p->data = data;
	p->next = NULL;//将最后一个后面的next指向为空

}
void init(int data){
	node* p = (node*)malloc(sizeof(node));
	p->data = data;
	p->next = NULL;
	head = p;//将p的值，放在第一个元素中
}
void display(){
	node * temp = head;
	do{
		printf("%d\t", temp->data);
		temp = temp->next;
	} while (temp->next != NULL);
	printf("\n");
}
void head_insert(int data){
	node * p = (node *)malloc(sizeof(node));
	p->data = data;
	p->next = head;
	head = p;

}