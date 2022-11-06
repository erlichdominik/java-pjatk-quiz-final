import {customElement, state} from "lit/decorators.js";
import {View} from "Frontend/views/view";
import {QuizEndpoint} from "Frontend/generated/endpoints";
import QuizName from "Frontend/generated/com/pjatk/quiz/app/quiz/dto/QuizName";
import {html} from "lit";

@customElement('choose-quiz-view')
export class ChooseQuizView extends View {
    @state()
    private quizes: QuizName[] = [];

    async connectedCallback() {
        super.connectedCallback();
        this.quizes = await QuizEndpoint.fetchQuizNames();
    }

    render() {
        return html`
            <vaadin-list-box>
                ${this.quizes.map(it => html`<vaadin-item onclick="router.">${it.name}</vaadin-item>`)}
            </vaadin-list-box>    
        `
    }

    private redirectToQuiz(quizName: string): void {
       window.location.href = '/'
    }

}