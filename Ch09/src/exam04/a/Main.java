package exam04.a;

public class Main {

	public static void main(String[] args) {
//		Person worker = new Person() {
//			void wake() {
//				System.out.println("Wake up at 6!!");
//				Work();
//			}
//			void work() {
//				System.out.println("Go to work!!");
//			}
//		};
//		worker.wake();
//		worker.work(); ja 자식 형태를 부
		
		NPCGenerator npc = new NPCGenerator();
		
//s		npc.worker.wake(); j
//		npc.GeneratorWalker();
		
		npc.GeneratorPerson(
				new Person() {
					void wake() {
						System.out.println("Wake up at 8!!");
						work();
					}
					void work() {
						System.out.println("Go to school!!");
					}
				}
		);
		
		
	}

}
