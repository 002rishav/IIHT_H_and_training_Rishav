import { Action } from "@ngrx/store";
import { TodoActionType } from "../shared/todo-action-types.enums";


export class ActionParent implements Action {
    type:any;
    payload:any;
}

export class TodoAdd implements ActionParent {
    type: TodoActionType.Add;
    constructor(public payload:any){
        
    }
}