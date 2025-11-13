package exam04.a;

public class NPCGenerator {
	Person worker = new Person() {

		void wake() {
			System.out.println("Wake up at 6!!");
			work();
		}
		
		void work() {
			System.out.println("Go to work!!");
		}
	};
	
	void GeneratorWalker() {
		Person worker = new Person() {

			void wake() {
				System.out.println("Wake up at 9!!");
				work();
			}

			void work() {
				System.out.println("Go to work!!");
			}
		};
		
		worker.wake();
	}
	
	void GeneratorPerson(Person person) {
		person.wake();
	}
}
