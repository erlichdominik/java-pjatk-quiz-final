import {customElement} from "lit/decorators.js";
import {View} from "Frontend/views/view";
import {html} from "lit";
import {router} from "Frontend/index";

@customElement("home-view")
export  class HomeView extends View {

    render() {
        return html`
            <h2>Welcome to physiology quiz</h2>
            <h3><a href="${router.urlForPath("choose-quiz")}">${router.urlForPath("/choose-quiz")}</a></h3>
        `
    }

    connectedCallback() {
        super.connectedCallback();
        this.classList.add(
            'flex',
            'flex-col',
            'h-full',
            'items-center',
            'justify-center',
            'p-l',
            'text-center',
            'box-border'
        );
    }
}