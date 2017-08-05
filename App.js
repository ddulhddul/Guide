import React, {Component} from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableOpacity,
  Animated
} from 'react-native';
import Ionicons from 'react-native-vector-icons/Ionicons'


export default class App extends React.Component {

  render() {
    return (
      <Todo />
    );
  }
}

class Todo extends Component {
  componentWillMount() {
    this.setState({
      inputText: '',
      todos: [],
    })
  }

  addTodo() {
    let todoItem = {
      context: this.state.inputText,
      complete: false
    }
    let todos = this.state.todos
    todos.push(todoItem)
    this.setState({
      inputText: '',
      todos: todos,
    })
  }

  completeTodo(index) {
    let todos = this.state.todos
    todos[index].complete = !todos[index].complete
    this.setState({
      todos: todos,
    })
  }

  deleteTodo (index) {
    let todos = this.state.todos
    todos.splice(index, 1)
    this.setState({
      todos: todos,
    })
  }


  constructor(props) {
    super(props);
    this.state = {
      x: new Animated.Value(100),
    };
  }
  click(){
    if(this.state.x._value == 100){
      Animated.spring(
        this.state.x,
        {toValue: 200}
      ).start();
    }
    else{
      Animated.timing(
        this.state.x,
        {toValue: 100}
      ).start();
    }

  }



  render() {
    return (
      <View style={styles.container}>
          
        <Ionicons size={35} name='ios-person-outline' color="#000000" />

        <TextInput
          style={{height: 40,borderColor: 'gray', borderWidth: 1}}
          onChangeText={(text) => {
            this.setState({inputText: text})
          }}
          value={this.state.inputText}
          />
        {
          this.state.todos.map((todoItem, index)=> {
            return (
              <View key={index} style={{flexDirection: 'row'}}>
                <Text style={todoItem.complete ? {textDecorationLine: 'line-through'} : {textDecorationLine: 'none'}}>
                  {todoItem.context}
                </Text>
                <TouchableOpacity onPress={this.completeTodo.bind(this, index)}>
                  <Text>{todoItem.complete ? "---complete" : "---incomplete" }</Text>
                </TouchableOpacity>
                <TouchableOpacity onPress={this.deleteTodo.bind(this, index)}>
                  <Text>     delete </Text>
                </TouchableOpacity>
              </View>
            )
          })
        }
        <TouchableOpacity onPress={this.addTodo.bind(this)}>
          <Animated.View style={{position: 'absolute', backgroundColor: '#AAAAAA', right: this.state.x, bottom: 100, height: 30, width: 30, backgroundColor:'red'}}>
            <Text>
              add Todo
            </Text>
          </Animated.View>
        </TouchableOpacity>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
