package kr.human.app.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.human.app.config.AppConfig;
import kr.human.app.controller.AppController;
import kr.human.app.vo.PeopleVO;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

	AppController appController = context.getBean("appController", AppController.class);
	
	//저장 - 완료
	PeopleVO peopleVO = new PeopleVO(0, "저장한사람" , 22);
	appController.insert(peopleVO);
	
	
	//삭제 - 완료
	peopleVO.setIdx((int)(Math.random()*10) +1);
	if(appController.delete(peopleVO)) {
		System.out.println(peopleVO.getIdx() + "번 삭제 성공!!!");
	}else {
		System.out.println(peopleVO.getIdx() + "번 삭제 실패!!!");
	}
	
	//수정 - 완료
	peopleVO.setIdx(1);
	peopleVO.setName("수정했음");
	peopleVO.setAge(22);
	appController.update(peopleVO);
	
	print(appController);
	
	context.close();
	}

	private static void print(AppController appController) {
		List<PeopleVO> list = appController.selectList();
		for(PeopleVO vo : list) {
			System.out.print(vo.getIdx()+". ");
			System.out.print(vo.getName()+"(");
			System.out.println(vo.getAge()+")");
		}
		System.out.println("-".repeat(100));
	}
}
